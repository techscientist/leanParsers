import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String start_time;
	public String background_image;
	public VersionModel _version;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String type;
	public String end_time;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String email;
	public int id;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String organizer_name;
	public String organizer_description;
	public String state;
	public String name;
	public String timezone;
	public String description;
	public String topic;

	public RootModel(String privacy, String start_time, String background_image, VersionModel version, String schedule_published_on, Call_for_papersModel call_for_papers, String location_name, String type, String end_time, CreatorModel creator, ArrayList<Social_linksModel> social_links, String logo, String email, int id, CopyrightModel copyright, String code_of_conduct, String organizer_name, String organizer_description, String state, String name, String timezone, String description, String topic) {

		this.privacy = privacy;
		this.start_time = start_time;
		this.background_image = background_image;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.type = type;
		this.end_time = end_time;
		this._creator = creator;
		this.social_links = social_links;
		this.logo = logo;
		this.email = email;
		this.id = id;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.state = state;
		this.name = name;
		this.timezone = timezone;
		this.description = description;
		this.topic = topic;

	}

}
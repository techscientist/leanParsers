import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String name;
	public String background_image;
	public String organizer_name;
	public String description;
	public String email;
	public CreatorModel _creator;
	public String end_time;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String start_time;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String type;
	public String state;
	public String code_of_conduct;
	public int id;
	public VersionModel _version;
	public String organizer_description;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String topic;

	public RootModel(String location_name, String name, String background_image, String organizer_name, String description, String email, CreatorModel creator, String end_time, String schedule_published_on, CopyrightModel copyright, String start_time, String timezone, ArrayList<Social_linksModel> social_links, String logo, String type, String state, String code_of_conduct, int id, VersionModel version, String organizer_description, String privacy, Call_for_papersModel call_for_papers, String topic) {

		this.location_name = location_name;
		this.name = name;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.description = description;
		this.email = email;
		this._creator = creator;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.start_time = start_time;
		this.timezone = timezone;
		this.social_links = social_links;
		this.logo = logo;
		this.type = type;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._version = version;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.topic = topic;

	}

}
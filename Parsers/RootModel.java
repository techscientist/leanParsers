import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String organizer_description;
	public String end_time;
	public String name;
	public CreatorModel _creator;
	public String timezone;
	public String background_image;
	public VersionModel _version;
	public String organizer_name;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String state;
	public String code_of_conduct;
	public String schedule_published_on;
	public String logo;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String type;
	public CopyrightModel _copyright;
	public String email;
	public String topic;

	public RootModel(String start_time, String organizer_description, String end_time, String name, CreatorModel creator, String timezone, String background_image, VersionModel version, String organizer_name, String location_name, Call_for_papersModel call_for_papers, String description, String state, String code_of_conduct, String schedule_published_on, String logo, String privacy, ArrayList<Social_linksModel> social_links, int id, String type, CopyrightModel copyright, String email, String topic) {

		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.name = name;
		this._creator = creator;
		this.timezone = timezone;
		this.background_image = background_image;
		this._version = version;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.privacy = privacy;
		this.social_links = social_links;
		this.id = id;
		this.type = type;
		this._copyright = copyright;
		this.email = email;
		this.topic = topic;

	}

}
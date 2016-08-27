import java.util.ArrayList;

class RootModel {

	public String logo;
	public String privacy;
	public VersionModel _version;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String description;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String timezone;
	public String state;
	public String type;
	public String start_time;
	public String name;
	public String schedule_published_on;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String code_of_conduct;
	public String end_time;
	public String email;
	public String topic;

	public RootModel(String logo, String privacy, VersionModel version, CreatorModel creator, CopyrightModel copyright, String organizer_description, String description, int id, Call_for_papersModel call_for_papers, String location_name, String timezone, String state, String type, String start_time, String name, String schedule_published_on, String background_image, ArrayList<Social_linksModel> social_links, String organizer_name, String code_of_conduct, String end_time, String email, String topic) {

		this.logo = logo;
		this.privacy = privacy;
		this._version = version;
		this._creator = creator;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.description = description;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.timezone = timezone;
		this.state = state;
		this.type = type;
		this.start_time = start_time;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.email = email;
		this.topic = topic;

	}

}
import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String description;
	public String privacy;
	public String timezone;
	public String end_time;
	public String location_name;
	public String organizer_name;
	public String logo;
	public String background_image;
	public String type;
	public String topic;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String start_time;
	public int id;
	public String organizer_description;
	public String name;

	public RootModel(VersionModel version, Call_for_papersModel call_for_papers, String state, String code_of_conduct, CreatorModel creator, String description, String privacy, String timezone, String end_time, String location_name, String organizer_name, String logo, String background_image, String type, String topic, CopyrightModel copyright, String schedule_published_on, ArrayList<Social_linksModel> social_links, String email, String start_time, int id, String organizer_description, String name) {

		this._version = version;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.description = description;
		this.privacy = privacy;
		this.timezone = timezone;
		this.end_time = end_time;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.background_image = background_image;
		this.type = type;
		this.topic = topic;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.email = email;
		this.start_time = start_time;
		this.id = id;
		this.organizer_description = organizer_description;
		this.name = name;

	}

}
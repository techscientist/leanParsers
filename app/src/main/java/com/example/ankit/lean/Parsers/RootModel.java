import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String privacy;
	public String organizer_name;
	public String type;
	public String logo;
	public int id;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public CopyrightModel _copyright;
	public String timezone;
	public String background_image;
	public String email;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String start_time;
	public String schedule_published_on;
	public String name;
	public String topic;
	public String description;
	public String code_of_conduct;
	public String organizer_description;

	public RootModel(CreatorModel creator, String privacy, String organizer_name, String type, String logo, int id, String location_name, ArrayList<Social_linksModel> social_links, String state, CopyrightModel copyright, String timezone, String background_image, String email, VersionModel version, Call_for_papersModel call_for_papers, String end_time, String start_time, String schedule_published_on, String name, String topic, String description, String code_of_conduct, String organizer_description) {

		this._creator = creator;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.type = type;
		this.logo = logo;
		this.id = id;
		this.location_name = location_name;
		this.social_links = social_links;
		this.state = state;
		this._copyright = copyright;
		this.timezone = timezone;
		this.background_image = background_image;
		this.email = email;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.topic = topic;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;

	}

}